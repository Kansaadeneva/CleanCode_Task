Analisis kode awal:
1. Nama class tidak sesuai konvensi
    - codeconventionbad -> sedangkan file nya disimpan dgn CodeConventionBad.java (diperbaiki menjadi CodeConventionClean, dan file nya juga disimpan dgn CodeConventionClean.java)
    - employeE_data -> tdk pakai pascal case (perbaikan jadi Employee)
    - managEr -> tidak pakai pascal case (diperbaiki jadi Manager)

2. Method & variabel tidak konsisten penamaanya
    - procESScalc, HITUNGGaJI → penulisan random huruf besar/kecil (Perbaikan: diganti menjadi calculateSalary,)
    - Variabel NAMA, JAM, u, nm, SALARY, JAMkerja → membingungkan dan tidak jelas artinya (Perbaikan: diganti menjadi name, workHours, hourlyRate, salaryPerHour)

3. Output tidak rapi / tidak konsisten
    - "PROGRAM HITUNG gaji===>" → tidak konsisten kapitalisasi dan formatting
    - Output "nama:"+NAMA+" gaji="+hasil; → kurang informatif
    - Perbaikan: "=== Program Hitung Gaji ===" dan "Nama: " + name + " | Gaji: " + totalSalary
    
4. Tidak ada access modifier (encapsulation)
    - Field String nm, int SALARY, int JAMkerja → tidak private
    - Perbaikan: pakai private di class Manager

5. Nama constructor parameter tidak konsisten
    - String nm, int SALARY, int JamKerja → ada huruf random besar kecil
    - Perbaikan: String name, int salaryPerHour, int workHours

6. Class Manager method tidak deskriptif
    - Method HITUNGGaJI() → semua capslock, tidak sesuai Java convention
    - Perbaikan: jadi calculateSalary()

7. Penulisan kurung kurawal & indentasi
    - Awalnya { sering di baris berbeda & indentasi berantakan
    - Perbaikan: semua { dibuka di baris yang sama, indentasi konsisten 4 spasi


## Hasil Perbaikan (Clean Code – CodeConventionClean)
    - Class pakai PascalCase: CodeConventionClean, Employee, Manager
    - Method & variabel pakai camelCase: calculateSalary, workHours, hourlyRate
    - Konstanta tidak ada di studi kasus ini, tapi kalau ada wajib UPPER_SNAKE_CASE
    - Encapsulation: field di Manager dibuat private
    - Output lebih rapi, mudah dibaca: "Nama: Budi | Gaji: 2000000"
    - Kode jadi lebih konsisten, mudah dipahami, dan bisa dikembangkan.