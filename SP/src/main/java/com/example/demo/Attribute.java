package com.example.demo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Attribute")
public class Attribute {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "attribute_id", nullable = false)
	private long attribute_id;
	
	private String attribute_name;
	private String description;
	private String data_type;
	private String is_base;
	private String is_predefined;
	private String validation_plugin;
	private String created_by;
	private String creation_dttm;
	private String updated_by;
	private String updated_dttm;
	
	
	
	@OneToMany(targetEntity=AttributeValue.class,cascade=CascadeType.ALL)
	@JoinColumn(name="e_id",referencedColumnName="attribute_id")
	private List<AttributeValue> value;
	
	@OneToMany(targetEntity=AttributeEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="ee_id",referencedColumnName="attribute_id")
	private List<AttributeEntity> values;
	
	
	
	public long getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(long attribute_id) {
		this.attribute_id = attribute_id;
	}
	public String getAttribute_name() {
		return attribute_name;
	}
	public void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public String getIs_base() {
		return is_base;
	}
	public void setIs_base(String is_base) {
		this.is_base = is_base;
	}
	public String getIs_predefined() {
		return is_predefined;
	}
	public void setIs_predefined(String is_predefined) {
		this.is_predefined = is_predefined;
	}
	public String getValidation_plugin() {
		return validation_plugin;
	}
	public void setValidation_plugin(String validation_plugin) {
		this.validation_plugin = validation_plugin;
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
		return "AttributeEntity [attribute_id=" + attribute_id + ", attribute_name=" + attribute_name + ", description="
				+ description + ", data_type=" + data_type + ", is_base=" + is_base + ", is_predefined=" + is_predefined
				+ ", validation_plugin=" + validation_plugin + ", created_by=" + created_by + ", creation_dttm="
				+ creation_dttm + ", updated_by=" + updated_by + ", updated_dttm=" + updated_dttm + "]";
	}
	
	


}
