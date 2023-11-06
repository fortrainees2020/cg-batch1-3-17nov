package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private int id;

 @Column(name = "title")
 private String title;

 public Course() {}

 public Course(String title) {
  this.title = title;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 @Override
 public String toString() {
  return "Course [id=" + id + ", title=" + title + "]";
 }
}