/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "GROUPS")
public class Group {
    private long id;
    private String name;
 
    private List<UserGroup> userGroups;
     
    public Group() {
    }
 
    public Group(String name) {
        this.name = name;
    }
         
    @Id
    @GeneratedValue
    @Column(name = "GROUP_ID")
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @OneToMany(mappedBy = "primaryKey.group",
            cascade = CascadeType.ALL)
    public List<UserGroup> getUserGroups() {
        return userGroups;
    }
 
    public void setUserGroups(List<UserGroup> groups) {
        this.userGroups = groups;
    }
     
    public void addUserGroup(UserGroup userGroup) {
        this.userGroups.add(userGroup);
    }
}