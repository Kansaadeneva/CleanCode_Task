# Change Preventers

## Code Smell: Change Preventers
    change preventers merupakan kategori code smells yg muncul ketika desain membuat setiap perubahan pada satu area menuntut perubahan serentak pada area-area lain, sehingga kode sulit dimodifikasi.
    <img width="572" height="183" alt="image" src="https://github.com/user-attachments/assets/ad14719b-d546-406d-97ef-edbd26fa02cb" />

## Change Preventers 1: Divergent Change
    terjadi ketika satu kelas harus sering diubah untuk berbagai alasan berbeda (misalnya aturan bisnis, validasi, logging, integrasi, dll) 
    sehingga setiap perubahan maka harus menyentuk beberapa methdo dlm kelas yg sama.
    example:
    <img width="393" height="355" alt="image" src="https://github.com/user-attachments/assets/a9d03ffc-d67b-418e-a058-58747b39cb0b" />

    solution example:
    <img width="871" height="362" alt="image" src="https://github.com/user-attachments/assets/ad293233-aa76-477d-880f-5d17b9c8df34" />
    refactor : exrtract class dan extrac superclass


## Change Preventers 2 : Shotgun Surgery
    terjadi kaetika satu perubahan kecil dalam sistem memaksa kita untuk memodifikasi banyak kelas atau file secara bersamaan, karena logika yg sama tersebar di berbagai tempat.

    example:
    <img width="495" height="434" alt="image" src="https://github.com/user-attachments/assets/5682c622-5857-4efd-8230-68dda07fcafe" />

    refactor:
    - gunakan move method dan move field untuk memindahkan perilaku atau data yg seharusnya berada di kelas lain. jika belum ada kelas yg sesuai, buat kelas baru.
    - jika setelah dipindahkan kelas asal jadi hampir kosong, hapus aja dengan inline class agar code lebih ringkas.

## Change Preventers 3: Paralel inheritance hierarchies
    terjadi ketika penambahan subclass pada satu hirarki class mengharuskan kita menambahkan subcalsa yg sama pada hierarki class lain, sehingga dua atau lebih struktur pewarisan tumbuh secara paralel

    example:
    <img width="853" height="334" alt="image" src="https://github.com/user-attachments/assets/073f9422-4dc7-4f40-8db0-650d94f820dd" />

    solution:
    <img width="664" height="320" alt="image" src="https://github.com/user-attachments/assets/7f26f5f0-bb08-4929-a542-9bc172fcabd2" />
    refactor:
    1. hubungkan dua hirarki
    2. pindahkan perilaku penting
    3. hapus hirarki duplikat
    


