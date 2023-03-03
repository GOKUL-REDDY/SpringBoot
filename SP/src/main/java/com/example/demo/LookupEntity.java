package com.example.demo;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LOOKUP")
public class  LookupEntity { 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "lookup_id", nullable = false)
	private long lookup_id;
	@Column(name = "lookup_name", unique = true, nullable = false)
	private String lookup_name;
	@Column(name = "description", nullable = false)
	private String description;
	private String is_base;
	private String created_by;
	private String creation_dttm;
	private String updated_by;
	private String updated_dttm;

	
	
	@OneToMany(targetEntity=LookupValueEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="l_id",referencedColumnName="lookup_id")
	private List<LookupValueEntity> values;
	
	
	
	
	
	public String getUpdated_dttm() {
		return updated_dttm;
	}
	public void setUpdated_dttm(String updated_dttm) {
		this.updated_dttm = updated_dttm;
	}
	@Override
	public String toString() {
		return "LookupEntity [lookup_id=" + lookup_id + ", lookup_name=" + lookup_name + ", description=" + description
				+ ", is_base=" + is_base + ", created_by=" + created_by + ", creation_dttm=" + creation_dttm
				+ ", updated_by=" + updated_by + ", updated_dttm=" + updated_dttm + ", values=" + values + "]";
	}
	public long getLookup_id() {
		return lookup_id;
	}
	public void setLookup_id(long lookup_id) {
		this.lookup_id = lookup_id;
	}
	public String getLookup_name() {
		return lookup_name;
	}
	public void setLookup_name(String lookup_name) {
		this.lookup_name = lookup_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIs_base() {
		return is_base;
	}
	public void setIs_base(String is_base) {
		this.is_base = is_base;
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
	
	
}
