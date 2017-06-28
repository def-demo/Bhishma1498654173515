package com.altimetrik.ccigit.model;

import com.altimetrik.ccigit.model.SoftSkills;
import com.altimetrik.ccigit.model.CoreAltimetrikSkills;
import com.altimetrik.ccigit.model.TechnicalSkills;
import java.util.Date;

import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class Employeeccindex  {
  
  
   
   
  
  private Double ccsa = null;
  
   
   
  
  private SoftSkills softskills = null;
  
   
   
  
  private String level = null;
  
   
   
  
  private String mentorempid = null;
  
   
   
  
  private String menteeemail = null;
  
   
   
  
  private String mentorempname = null;
  
   
   
  
  private CoreAltimetrikSkills corealtimetrikskills = null;
  
   
   
  
  private String menteename = null;
  
   
   
  
  private Date timestamp = null;
  
   
   
  
  private String capabilitycentre = null;
  
   
   
  
  private TechnicalSkills technicalskills = null;
  
   
   
  
  private String location = null;
  
   
  
  @Id
   
  
  private String id = null;
  
   
   
  
  private String projectname = null;

  
  /**
   * {}
   **/
  public Double getCcsa() {
    return ccsa;
  }
  public void setCcsa(Double ccsa) {
    this.ccsa = ccsa;
  }

  
  /**
   **/
  public SoftSkills getSoftskills() {
    return softskills;
  }
  public void setSoftskills(SoftSkills softskills) {
    this.softskills = softskills;
  }

  
  /**
   * {}
   **/
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  
  /**
   * {}
   **/
  public String getMentorempid() {
    return mentorempid;
  }
  public void setMentorempid(String mentorempid) {
    this.mentorempid = mentorempid;
  }

  
  /**
   * {}
   **/
  public String getMenteeemail() {
    return menteeemail;
  }
  public void setMenteeemail(String menteeemail) {
    this.menteeemail = menteeemail;
  }

  
  /**
   * {}
   **/
  public String getMentorempname() {
    return mentorempname;
  }
  public void setMentorempname(String mentorempname) {
    this.mentorempname = mentorempname;
  }

  
  /**
   **/
  public CoreAltimetrikSkills getCorealtimetrikskills() {
    return corealtimetrikskills;
  }
  public void setCorealtimetrikskills(CoreAltimetrikSkills corealtimetrikskills) {
    this.corealtimetrikskills = corealtimetrikskills;
  }

  
  /**
   * {}
   **/
  public String getMenteename() {
    return menteename;
  }
  public void setMenteename(String menteename) {
    this.menteename = menteename;
  }

  
  /**
   * {}
   **/
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * {}
   **/
  public String getCapabilitycentre() {
    return capabilitycentre;
  }
  public void setCapabilitycentre(String capabilitycentre) {
    this.capabilitycentre = capabilitycentre;
  }

  
  /**
   **/
  public TechnicalSkills getTechnicalskills() {
    return technicalskills;
  }
  public void setTechnicalskills(TechnicalSkills technicalskills) {
    this.technicalskills = technicalskills;
  }

  
  /**
   * {}
   **/
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  
  /**
   * {"primaryKey":true}
   **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getProjectname() {
    return projectname;
  }
  public void setProjectname(String projectname) {
    this.projectname = projectname;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employeeccindex employeeccindex = (Employeeccindex) o;
    return Objects.equals(ccsa, employeeccindex.ccsa) &&
        Objects.equals(softskills, employeeccindex.softskills) &&
        Objects.equals(level, employeeccindex.level) &&
        Objects.equals(mentorempid, employeeccindex.mentorempid) &&
        Objects.equals(menteeemail, employeeccindex.menteeemail) &&
        Objects.equals(mentorempname, employeeccindex.mentorempname) &&
        Objects.equals(corealtimetrikskills, employeeccindex.corealtimetrikskills) &&
        Objects.equals(menteename, employeeccindex.menteename) &&
        Objects.equals(timestamp, employeeccindex.timestamp) &&
        Objects.equals(capabilitycentre, employeeccindex.capabilitycentre) &&
        Objects.equals(technicalskills, employeeccindex.technicalskills) &&
        Objects.equals(location, employeeccindex.location) &&
        Objects.equals(id, employeeccindex.id) &&
        Objects.equals(projectname, employeeccindex.projectname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccsa, softskills, level, mentorempid, menteeemail, mentorempname, corealtimetrikskills, menteename, timestamp, capabilitycentre, technicalskills, location, id, projectname);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employeeccindex {\n");
    
    sb.append("  ccsa: ").append(ccsa).append("\n");
    sb.append("  softskills: ").append(softskills).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("  mentorempid: ").append(mentorempid).append("\n");
    sb.append("  menteeemail: ").append(menteeemail).append("\n");
    sb.append("  mentorempname: ").append(mentorempname).append("\n");
    sb.append("  corealtimetrikskills: ").append(corealtimetrikskills).append("\n");
    sb.append("  menteename: ").append(menteename).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  capabilitycentre: ").append(capabilitycentre).append("\n");
    sb.append("  technicalskills: ").append(technicalskills).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  projectname: ").append(projectname).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

