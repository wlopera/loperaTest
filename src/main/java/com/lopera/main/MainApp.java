package com.lopera.main;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.beanutils.BeanUtils;

import com.lopera.model.Address;
import com.lopera.model.User;
import com.lopera.utils.OperationTypeEnum;

public class MainApp {

	public static void main(String[] args) {
		MainApp app = new MainApp();

		List<User> names = app.initData();
		List<User> namesSession = app.initSessionData();

		try {
			// Imprimir todos los usuarios
			System.out.println("Todos los usuarios...................");
			names.forEach(System.out::println);
			System.out.println("Todos los usuarios en session...................");
			namesSession.forEach(System.out::println);

			Map<OperationTypeEnum, List<User>> mapa = app.getDifferences(namesSession, names, "id");

			mapa.forEach((k, v) -> {
				System.out.println(k + " : ");
				v.forEach(System.out::println);
			});

			System.out.println("Useo de recursividad......................");
			
			for (User user : names) {
				if (app.existValueList(namesSession, "address.id", String.valueOf(user.getAddress().getId()))) {
					System.out.println("Existe: " + user.toString());
					continue;
				}
				System.out.println("No Existe: " + user.toString());
			}
			
			System.out.println("Useo java clasica......................");
			for (User user : names) {
				if (app.existValueList(namesSession, user.getAddress().getId())) {
					System.out.println("Existe: " + user.toString());
					continue;
				}
				System.out.println("No Existe: " + user.toString());
			}

		} catch (

		Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Evalua si la lista contiene un valor - Java Clasico
	 * 
	 * @param inputList Lista de valores
	 * @param value Valor a consultar
	 * 
	 * @return Si existe el valor consultado
	 * 
	 * @throws Exception En caso de error
	 */
	private boolean existValueList(List<User> inputList, Integer value) throws Exception {
		for (User item : inputList) {
			if (value.equals(item.getAddress().getId())) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	/**
	 * Evalua si la lista contiene un valor - Java recursividad
	 * 
	 * @param inputList Lista de valores
	 * @param value Valor a consultar
	 * 
	 * @return Si existe el valor consultado
	 * 
	 * @throws Exception En caso de error
	 */
	private <T> boolean existValueList(List<T> inputList, String param, String value) throws Exception {

		WeakHashMap<Object, T> sessionMap = new WeakHashMap<>();

		// Almacenar los valores de sesion en mapa auxiliar
		for (T item : inputList) {
			sessionMap.put(BeanUtils.getNestedProperty(item, param), item);
		}

		return sessionMap.containsKey(value);

	}

	/**
	 * Generico para evaluar lista de objetos entre vista - sesion para generar
	 * lista de objetos a crear o eliminar
	 * 
	 * @param oldValues Valores previos (Ej. Sesion de usuario)
	 * @param newValues Valores nuevos (Ej. Frontend)
	 * @param param     Parametro de consulta que permite realizar la comparacion de
	 *                  objetos
	 * 
	 * @return mapa con valores para creacion, actualizacion y/o eliminacion
	 * 
	 * @throws BGPBusinessException Si ocurre algun error en la transformacion o
	 *                              acceso a datos
	 * 
	 */
	public <T> Map<OperationTypeEnum, List<T>> getDifferences(List<T> oldValues, List<T> newValues, String param)
			throws Exception {

		try {

			EnumMap<OperationTypeEnum, List<T>> diffMap = new EnumMap<>(OperationTypeEnum.class);

			diffMap.put(OperationTypeEnum.CREATE, new ArrayList<>());
			diffMap.put(OperationTypeEnum.DELETE, new ArrayList<>());

			WeakHashMap<Object, T> sessionMap = new WeakHashMap<>();

			// Almacenar los valores de sesion en mapa auxiliar
			for (T item : oldValues) {
				sessionMap.put(BeanUtils.getSimpleProperty(item, param), item);
			}

			for (T item : newValues) {

				// Si el objeto no tiene ID se agrega a la lista de creacion
				if (sessionMap.containsKey(BeanUtils.getSimpleProperty(item, param))) {

					// Los valores encontrados se eliminan de mapa auxiliar
					sessionMap.remove(BeanUtils.getSimpleProperty(item, param));

					continue;

				}
				diffMap.get(OperationTypeEnum.CREATE).add(item);

				// Los valores encontrados se eliminan de mapa auxiliar
				sessionMap.remove(BeanUtils.getSimpleProperty(item, param));

			}

			// Los valores restantes van al mapa de eliminacion
			sessionMap.keySet().forEach(key -> diffMap.get(OperationTypeEnum.DELETE).add(sessionMap.get(key)));

			return diffMap;

		} catch (Exception e) {
			throw new Exception("Error en armado de mapa de diferencias: " + e.getMessage(), e);
		}

	}

	/**
	 * Lista inicial de usuarios de prueba
	 * 
	 * @return Lista de usuarios
	 */
	public List<User> initData() {

		List<User> users = new ArrayList<User>();

		users.add(new User(1, "Elivar", "Oswaldo", 10, new Address(1, "San Pedro")));
		users.add(new User(2, "Antonio", "Carrion", 15, new Address(2, "San Juan")));
		users.add(new User(3, "Juan", "Andrade", 12, new Address(3, "San Jorge")));
		users.add(new User(4, "Luis", "Aguilar", 17, new Address(4, "San Fernando")));
		users.add(new User(5, "Fidel", "Narvaez", 8, new Address(5, "San Onofre")));
		users.add(new User(6, "Paul", "Guevara", 5, new Address(6, "San Felix")));

		return users;

	}

	/**
	 * Lista inicial de usuarios de prueba
	 * 
	 * @return Lista de usuarios
	 */
	public List<User> initSessionData() {

		List<User> users = new ArrayList<User>();

		users.add(new User(7, "Mc", "Donald", 10, new Address(7, "San Luis")));
		users.add(new User(2, "Antonio", "Carrion", 15, new Address(2, "San Juan")));
		users.add(new User(3, "Juan", "Andrade", 12, new Address(3, "San Jorge")));
		users.add(new User(8, "Tom", "Raider", 17, new Address(8, "San Lucas")));
		users.add(new User(5, "Fidel", "Narvaez", 8, new Address(5, "San Onofre")));
		users.add(new User(9, "Roberto", "Clemente", 5, new Address(9, "San Isidro")));

		return users;

	}

}
