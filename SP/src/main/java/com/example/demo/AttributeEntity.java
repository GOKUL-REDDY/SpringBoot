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
@Table(name = "Attribute_entity")
public class AttributeEntity {
	@Id
	private long attribute_entity_id;
	
	private String attribute_id;
	private String entity_name;
	private String is_required;
	private String created_by;
	private String creation_dttm;
	private String updated_by;
	private String updated_dttm;
	public long getAttribute_entity_id() {
		return attribute_entity_id;
	}
	public void setAttribute_entity_id(long attribute_entity_id) {
		this.attribute_entity_id = attribute_entity_id;
	}
	public String getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(String attribute_id) {
		this.attribute_id = attribute_id;
	}
	public String getEntity_name() {
		return entity_name;
	}
	public void setEntity_name(String entity_name) {
		this.entity_name = entity_name;
	}
	public String getIs_required() {
		return is_required;
	}
	public void setIs_required(String is_required) {
		this.is_required = is_required;
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
	@Override
	public String toString() {
		return "AttributeEntity [attribute_entity_id=" + attribute_entity_id + ", attribute_id=" + attribute_id
				+ ", entity_name=" + entity_name + ", is_required=" + is_required + ", created_by=" + created_by
				+ ", creation_dttm=" + creation_dttm + ", updated_by=" + updated_by + ", updated_dttm=" + updated_dttm
				+ "]";
	}
	
	
	

}
