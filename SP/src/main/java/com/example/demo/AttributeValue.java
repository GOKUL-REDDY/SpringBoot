package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AttributeValue")
public class AttributeValue {
	
	@Id
	private long attribute_value_id;
	
	private long attribute_id;
	private String attribute_value;
	private String description;
	private String created_by;
	private String creation_dttm;
	private String updated_by;
	private String updated_dttm;
	
	@Override
	public String toString() {
		return "AttributeValueEntity [attribute_value_id=" + attribute_value_id + ", attribute_id=" + attribute_id
				+ ", attribute_value=" + attribute_value + ", description=" + description + ", created_by=" + created_by
				+ ", creation_dttm=" + creation_dttm + ", updated_by=" + updated_by + ", updated_dttm=" + updated_dttm
				+ "]";
	}
	public long getAttribute_value_id() {
		return attribute_value_id;
	}
	public void setAttribute_value_id(long attribute_value_id) {
		this.attribute_value_id = attribute_value_id;
	}
	public long getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(long attribute_id) {
		this.attribute_id = attribute_id;
	}
	public String getAttribute_value() {
		return attribute_value;
	}
	public void setAttribute_value(String attribute_value) {
		this.attribute_value = attribute_value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreation_dttm() {
		return creation_dttm;
	}
	public void setCreation_dttm(String creation_dttm) {
		this.creation_dttm = creation_dttm;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_dttm() {
		return updated_dttm;
	}
	public void setUpdated_dttm(String updated_dttm) {
		this.updated_dttm = updated_dttm;
	}
}
