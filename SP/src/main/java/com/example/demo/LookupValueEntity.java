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
@Table(name = "lookup_value")
public class LookupValueEntity {
	
	@Id
	private long lookup_value_id;
	
	private long lookup_id;
	private String lookup_value;
	private String description;
	private String lookup_attribute1;
	private String lookup_attribute3;
	private String lookup_attribute4;
	private String lookup_attribute5;
	private String created_by;
	private String creation_dttm;
	private String updated_by;
	private String updated_dttm;
	
	
	
	
	
	
	
	public long getLookup_value_id() {
		return lookup_value_id;
	}
	public void setLookup_value_id(long lookup_value_id) {
		this.lookup_value_id = lookup_value_id;
	}
	public long getLookup_id() {
		return lookup_id;
	}
	public void setLookup_id(long lookup_id) {
		this.lookup_id = lookup_id;
	}
	public String getLookup_value() {
		return lookup_value;
	}
	public void setLookup_value(String lookup_value) {
		this.lookup_value = lookup_value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLookup_attribute1() {
		return lookup_attribute1;
	}
	public void setLookup_attribute1(String lookup_attribute1) {
		this.lookup_attribute1 = lookup_attribute1;
	}
	public String getLookup_attribute3() {
		return lookup_attribute3;
	}
	public void setLookup_attribute3(String lookup_attribute3) {
		this.lookup_attribute3 = lookup_attribute3;
	}
	public String getLookup_attribute4() {
		return lookup_attribute4;
	}
	public void setLookup_attribute4(String lookup_attribute4) {
		this.lookup_attribute4 = lookup_attribute4;
	}
	public String getLookup_attribute5() {
		return lookup_attribute5;
	}
	public void setLookup_attribute5(String lookup_attribute5) {
		this.lookup_attribute5 = lookup_attribute5;
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
		return "LookupValueEntity [lookup_value_id=" + lookup_value_id + ", lookup_id=" + lookup_id + ", lookup_value="
				+ lookup_value + ", description=" + description + ", lookup_attribute1=" + lookup_attribute1
				+ ", lookup_attribute3=" + lookup_attribute3 + ", lookup_attribute4=" + lookup_attribute4
				+ ", lookup_attribute5=" + lookup_attribute5 + ", created_by=" + created_by + ", creation_dttm="
				+ creation_dttm + ", updated_by=" + updated_by + ", updated_dttm=" + updated_dttm + "]";
	}

	
	
}
