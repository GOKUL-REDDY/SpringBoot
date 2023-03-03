package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AllController {

	@Autowired
	AllService lookupServ;
	
	@PostMapping("/addlook")
	public LookupEntity addlook(@RequestBody LookupEntity var) {
		return lookupServ.insert_lookup(var);
	}
	
	@GetMapping("/getlook_ds/{descr}")
	public List<LookupEntity> getlookbyDs(@PathVariable String descr) {
		return lookupServ.getlook();
	}
	@GetMapping("/getlook_id/{id}")
	public LookupEntity getlookbyId(@PathVariable int id) {
		return lookupServ.getlookId(id);
	}

// ----lookupValue----------------------------------------------------------------------------------------------
	
	@PostMapping("/addlookvalue")
	public LookupValueEntity addlookvalue(@RequestBody LookupValueEntity var) {
		return lookupServ.insert_lookupvalue(var);
	}
	
	@GetMapping("/getlookvalue_ds/{descr}")
	public List<LookupValueEntity> findAllDescr(@PathVariable String descr) {
		return lookupServ.getlookupvalue();
	}
	@GetMapping("/getlookvalue_id/{id}")
	public LookupValueEntity findAllId(@PathVariable int id) {
		return lookupServ.getlookvalueid(id);
	}
	

	
// ---------------Attribute----------------------------------------------------------------------------------------------
	@PostMapping("/addAttribute")
	public Attribute addattribute(@RequestBody Attribute var) {
		return lookupServ.insert_attribute(var);
	}
	
	@GetMapping("/getattribute_ds/{descr}")
	public List<Attribute> getatt_Ds(@PathVariable String descr) {
		return lookupServ.getattribute();
	}
	@GetMapping("/getattribute_id/{id}")
	public Attribute getAtt_Id(@PathVariable int id) {
		return lookupServ.getAttributeid(id);
	}
	
// ---------------AttributeValue----------------------------------------------------------------------------------------------
	@PostMapping("/addAttributeValue")
	public AttributeValue insert_attributeValue(@RequestBody AttributeValue var) {
			return lookupServ.insert_attributeValue(var);
		}
		
	@GetMapping("/getattributeValue_ds/{descr}")
	public List<AttributeValue> getattributeValue(@PathVariable String descr) {
			return lookupServ.getattributeValue();
		}
	@GetMapping("/getattributeValue_id/{id}")
	public AttributeValue getAttributeValueid(@PathVariable int id) {
			return lookupServ.getAttributeValueid(id);
		}
	
	
// ---------------AttributeEntity----------------------------------------------------------------------------------------------
	@PostMapping("/addAttributeE")
	public AttributeEntity insert_attributeEntity(@RequestBody AttributeEntity var) {
				return lookupServ.insert_attributeEntity(var);
			}
			
	@GetMapping("/getattributeE_ds/{descr}")
	public List<AttributeEntity> getattributeEntity(@PathVariable String descr) {
				return lookupServ.getattributeEntity();
			}
	@GetMapping("/getattributeE_id/{id}")
	public AttributeEntity getAttributeEntityid(@PathVariable int id) {
				return lookupServ.getAttributeEntityid(id);
			}
					
}
