//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 11:45:57 AM EST 
//


package com.rankminer.featurevectoranalyzer.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configurations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configurationList" type="{http://www.featurevectoranalyzer.rankminer.com/configuration}configuration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurations", propOrder = {
	"emailConfig",
    "configurationList",
})
@XmlRootElement(name="configurations")
public class Configurations {

	@XmlElement(required = true, name="emailConfig")
	protected EmailConfiguration emailConfig;
	
	@XmlElementWrapper(name="configurationList")
	@XmlElement(required = true, name="configuration")
    protected List<Configuration> configurationList;

	@XmlTransient
	private Map<String, Configuration> configurationMap = new HashMap<String, Configuration>();
	
    /**
     * Gets the value of the configurationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configuration }
     * 
     * 
     */
    public List<Configuration> getConfigurationList() {
        if (configurationList == null) {
            configurationList = new ArrayList<Configuration>();
        }
        return this.configurationList;
    }

	public Configuration getConfiguration(String env) {
		if(configurationMap.size() == 0) {
			for(Configuration config : configurationList) {
				configurationMap.put(config.getEnvironment(), config);
			}
		}
		return configurationMap.get(env);
	}
	
	public EmailConfiguration getEmailConfiguration() {
		return emailConfig;
	}

	public void setEmailConfiguration(EmailConfiguration emailConfiguration) {
		this.emailConfig = emailConfiguration;
	}

}
