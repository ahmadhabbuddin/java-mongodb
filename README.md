# Spring Boot and MongoDB Example
Menggabungkan Spring Boot dan MongoDB menghasilkan aplikasi yang cepat, aman, andal, dan membutuhkan waktu pengembangan yang minimal. <br>
Berikut adalah contoh bagaimana Spring Boot dan MongoDB disatukan dengan mulus dengan menggunakan library Spring Data MongoDB dan akan membantu Anda membangun aplikasi Spring yang lengkap.

<br>

## Menjalankan MongoDB (opsional)
Apabila anda masih belum memiliki platform mongodb, ada beberapa cara yang dapat dilakukan untuk instalasi mongodb.
1. Untuk menginstall mongodb pada Windows, anda dapat mengunjungi halaman https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-windows/.

2. Untuk menginstall mongodb pada Linux, anda dapat mengunjungi halaman https://www.mongodb.com/docs/manual/administration/install-on-linux/.

3. Melakukan deployment pada docker. <br>
Setelah anda mendownload repository ini, cobalah masuk ke folder .docker, kemudian anda dapat jalankan perintah ```docker-compose up -d``` pada command line untuk menjalankan deployment docker-compose.yaml. <br>Selamat, platform mongodb anda sudah dapat digunakan. 

<br>

## Menjalankan Aplikasi Springboot
Ada beberapa langkah yang harus dilakukan untuk menjalankan aplikasi springboot.<br>
1. Setelah anda clone/download repository ini, buka folder java-mongo pada editor yang anda miliki.
2. Buka command line (cmd, shell, dsb), arahkan ke folder java-mongo.
3. Jalankan perintah ```mvn clean install``` untuk melakukan compile atau build aplikasi.
4. Jalankan perintah ```mvn spring-boot:run``` untuk menjalankan aplikasi springboot.

<b>Catatan: anda dapat menyesuaikan koneksi ke mongodb pada ./java-mongo/src/main/resources/application.properties</b>

<br/>

## REST API
Berikut beberapa REST API yang dapat di testing menggunakan postman. <br>
1. Get All Book<br>
```curl --location 'http://localhost:8080/books'```