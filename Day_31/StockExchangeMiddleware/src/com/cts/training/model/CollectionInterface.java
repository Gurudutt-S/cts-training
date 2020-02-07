package com.cts.training.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInterface {

	private List<String> list;
	private Set<String> set;
	private Map<Integer, String> map;
	private Properties properties;

	public CollectionInterface() {
		// TODO Auto-generated constructor stub
	}

	public CollectionInterface(List<String> list, Set<String> set, Map<Integer, String> map, Properties properties) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
		this.properties = properties;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionInterface list=" + list + ", set=" + set + ", map=" + map + ", properties=" + properties;
	}

}
