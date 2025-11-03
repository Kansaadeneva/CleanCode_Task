# Code Smells
## Object Orientation Abusers

code smell bukan bug maupun kesalahan teknis yg mengganggu jalanya program.

object orientation abusers -> jenis code smell yang muncul karena cara penggunaan konsep oop tidak tepat, misalnya salah menerapkan inheritance atau encapsulation sehingga kode jadi sulit dipelihara dan tidak efisien.
Object orientation abusers :
  1. alternative class wih diferent inerface -> code smell yg ada dua atau beberapa class yg melakukan fungsional yg sama persis, namun nama method yg berbeda
     contoh:
       _______________________      ______________________
       |      Truck          |      |        Truck       |
       -----------------------      ----------------------
       | + move()            |      | + bergerak()       |
       | + transportCargo()  |      |                    |
       _______________________      ______________________

     00 Abusers 1: Alternative Class with Different Class
     <img width="1213" height="633" alt="image" src="https://github.com/user-attachments/assets/946dda9a-d50d-4408-9a17-d48eb004d366" />
     00 Abusers 1: Refactoring
       - rename methods
       - move method, add parameter, and parameterize method
           a. memindahkan metode kelas yg lebih tepat
           b. menambahkan parameter agar satu method bisa digunakan untuk beberapa kasus
           c. menyatukan beberapa metode mirip menjadi satu metode fleksibel
           contoh:
           <img width="1160" height="635" alt="image" src="https://github.com/user-attachments/assets/c0631b35-3e58-413a-93a8-69ea71f01ba8" />
       - extract superclass
       - hapus class yg tidak diperlukan -> menyamakan nama metode, parameter dan struktur kelas. ternyata ada dua kelas yg fungsi nya mirip, maka hapus saja dan ganti dengan rafactor nya saja.

  2. Refused Bequest
    refused bequest -> pewarisan dari superclass ke subclass yg dilakukan hanya karena subclass memiliki fungsional yg sama dgn superclass. Selama tidak merubah fungsi parent nya, maka boleh menggunakan pewarisan.
    contoh:
      <img width="1213" height="634" alt="image" src="https://github.com/user-attachments/assets/e187c428-a1d5-4f83-9256-7522a4f61fae" />
    solusi: 
      - replace inheritance with delegation
      - extract superclass
      - contoh :
        <img width="1087" height="617" alt="image" src="https://github.com/user-attachments/assets/fe1a5f07-2015-4522-842d-62de563b70ca" />


  3. Switch Statement
     Switch statement -> dianggap code smell ketika kode menggunakan banyak switch atau if else untuk memilih perilaku berdasarkan tipe atau status objek.
     Masalah nya bukan karena switch itu tapi karena sering digunakan untuk menggantikan polimorfisme.
     contoh:
     <img width="1185" height="609" alt="image" src="https://github.com/user-attachments/assets/4eeee1c6-843f-4de8-a536-2ba6376abf83" />

     refactoring:
     - extract method + move method (pisahkan kode switch menjadi method sendiri) rsvp itu terjadi ketika di switch terdapat logika semua di fungsi ini, harusnya logika diserahkan di fungsi lain untuk menghindari rsvp.
     - replace type code with subclass / state / strategy (jika switch untuk membedakan tipe objek / mode program, ubah menjadi subclass / gunakan design pattern state / strategy agar fleksibel)
     - replace conditional with polymorphism
     - contoh
       <img width="1214" height="566" alt="image" src="https://github.com/user-attachments/assets/6fb62dae-18d7-44fe-b57b-c7b5823a9684" />
       
       <img width="1155" height="484" alt="image" src="https://github.com/user-attachments/assets/aca87615-abd9-492c-894c-a5ceb1bb0396" />

       

     
  4. Temprorary Field
     Temporary Field -> field yang dibutuhkan atau berisi data pada keadaan tertentu saja, tidak pula merepresentasikan atribut dari classnya.
     Misalnya, hanya aktif selama 1 method berjalan, dan tidak digunakan oleh method lain.
     contoh:
     <img width="421" height="200" alt="image" src="https://github.com/user-attachments/assets/3ecacadd-1b49-448d-b9e9-72da9288f1dd" />

     refactoring:
     - extract class -> replace method with object
     - intoduce null object
       
     contoh:
     <img width="1140" height="650" alt="image" src="https://github.com/user-attachments/assets/ecbf6833-066a-4daa-a737-b2cc878aa8d2" />


fyi:
 - inheritance -> is a
 - composition -> own
 - agregation -> has
 - pastikan semua fungsi punya responsibility dan harus linear dengan tujuan class nya. (ini sudah sangat membantu refactoring kode)
