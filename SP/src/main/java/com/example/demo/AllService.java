package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllService {
	
	@Autowired
	private LookupRepository LookRepo;
	
	@Autowired
	private LookupvalueRepo lookvalue;
	
	@Autowired
	private AttributeRepo attrepo;
	
	@Autowired
	private AttributeValueRepo attVrepo;
	
	@Autowired
	private Attribute_e_Repo attErepo;
	
	public LookupEntity insert_lookup(LookupEntity v1) {
		return LookRepo.save(v1);
	}
	
	public List<LookupEntity> getlook(){
		return LookRepo.findAll();
	}
	
	public LookupEntity  getlookId(int id) {
		return LookRepo.findById(id).orElse(null);
	}
//-------------------------------------------------------------------------------------------
	public LookupValueEntity insert_lookupvalue(LookupValueEntity v2) {
		return lookvalue.save(v2);
	}
	public List<LookupValueEntity> getlookupvalue(){
		return lookvalue.findAll();
	}
	
	public LookupValueEntity  getlookvalueid(int id) {
		return lookvalue.findById(id).orElse(null);
	}
//-------------------------------------------------------------------------------------------
	public Attribute insert_attribute(Attribute var) {
				return attrepo.save(var);
			}
	public List<Attribute> getattribute(){
				return attrepo.findAll();
			}
			
	public Attribute  getAttributeid(int id) {
				return attrepo.findById(id).orElse(null);
			}



//-------------------------------------------------------------------------------------------
		public AttributeValue insert_attributeValue(AttributeValue var) {
					return attVrepo.save(var);
				}
		public List<AttributeValue> getattributeValue(){
					return attVrepo.findAll();
				}
				
		public AttributeValue  getAttributeValueid(int id) {
					return attVrepo.findById(id).orElse(null);
				}

//-------------------------------------------------------------------------------------------
		public AttributeEntity insert_attributeEntity(AttributeEntity var) {
					return attErepo.save(var);
				}
		public List<AttributeEntity> getattributeEntity(){
					return attErepo.findAll();
				}
				
		public AttributeEntity  getAttributeEntityid(int id) {
					return attErepo.findById(id).orElse(null);
				}






}
	
