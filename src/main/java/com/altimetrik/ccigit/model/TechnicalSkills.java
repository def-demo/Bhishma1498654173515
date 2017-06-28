package com.altimetrik.ccigit.model;


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

public class TechnicalSkills  {
  
  
   
   
  
  private String skillname = null;
  
   
   
  
  private String skilltype = null;
  
   
   
  
  private String grade = null;

  
  /**
   * {}
   **/
  public String getSkillname() {
    return skillname;
  }
  public void setSkillname(String skillname) {
    this.skillname = skillname;
  }

  
  /**
   * {}
   **/
  public String getSkilltype() {
    return skilltype;
  }
  public void setSkilltype(String skilltype) {
    this.skilltype = skilltype;
  }

  
  /**
   * {}
   **/
  public String getGrade() {
    return grade;
  }
  public void setGrade(String grade) {
    this.grade = grade;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalSkills technicalSkills = (TechnicalSkills) o;
    return Objects.equals(skillname, technicalSkills.skillname) &&
        Objects.equals(skilltype, technicalSkills.skilltype) &&
        Objects.equals(grade, technicalSkills.grade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillname, skilltype, grade);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalSkills {\n");
    
    sb.append("  skillname: ").append(skillname).append("\n");
    sb.append("  skilltype: ").append(skilltype).append("\n");
    sb.append("  grade: ").append(grade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

