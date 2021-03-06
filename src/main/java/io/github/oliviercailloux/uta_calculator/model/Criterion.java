package io.github.oliviercailloux.uta_calculator.model;

import java.util.List;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;

public class Criterion {

	// Attributes
	private int id;
	private String name;
	private List<Double> scale;

	// Constructors
	public Criterion(int id, String name, List<Double> scale) {
		this.id = id;
		this.name = name;
		this.scale = scale;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getScale() {
		return scale;
	}

	public void setScale(List<Double> scale) {
		this.scale = scale;
	}

	// Methods
	public double getMinValue() {
		return scale.get(0);
	}

	public double getMaxValue() {
		return scale.get(scale.size() - 1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Criterion other = (Criterion) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
		stringHelper.add("id", id).add("name", name).add("scale", scale);
		return stringHelper.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}