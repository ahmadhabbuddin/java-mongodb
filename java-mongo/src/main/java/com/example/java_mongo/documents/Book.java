package com.example.java_mongo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("buku")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
  
  @Id
  private String id;
  private String ISBN;
  private String judul;
  private String penulis;
  private String penerbit;
  private int tahun_terbit;
  private String genre;
  private int jumlah_halaman;
  private String deskripsi;
  private String bahasa;
  private String edisi;
  private int harga;


}
