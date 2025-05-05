package com.angellevyne0045.miniproject2.ui.screen

import androidx.lifecycle.ViewModel
import com.angellevyne0045.miniproject2.model.Resep

class MainViewModel : ViewModel(){

    val data = listOf(
        Resep(
            id = 1,
            nama = "Nasi Goreng",
            deskripsi = "Nasi goreng dengan bumbu yang sederhana, mudah dibuat, dan lezat.",
            bahan = "Nasi putih, telur, bawang merah, bawang putih, kecap manis, minyak goreng, garam, merica",
            langkah = "1. Tumis bawang merah dan bawang putih hingga harum.\n" +
                    "2. Masukkan telur dan orak-arik.\n" +
                    "3. Tambahkan nasi, kecap manis, garam, dan merica.\n" +
                    "4. Aduk rata hingga matang, sajikan."
        ),
        Resep(
            id = 2,
            nama = "Mie Goreng",
            deskripsi = "Mie goreng yang gurih dan nikmat, cocok untuk makan malam.",
            bahan = "Mie instan, bawang merah, bawang putih, kecap manis, minyak goreng, sayuran (optional)",
            langkah = "1. Rebus mie instan sesuai petunjuk.\n" +
                    "2. Tumis bawang merah dan bawang putih.\n" +
                    "3. Masukkan mie dan kecap manis.\n" +
                    "4. Aduk rata, tambahkan sayuran jika suka.\n" +
                    "5. Sajikan selagi hangat."
        ),
        Resep(
            id = 3,
            nama = "Pancake",
            deskripsi = "Pancake yang empuk dan mudah dibuat, cocok untuk sarapan.",
            bahan = "Tepung terigu, telur, susu, gula, baking powder, garam, mentega",
            langkah = "1. Campurkan tepung terigu, baking powder, dan garam.\n" +
                    "2. Kocok telur, susu, dan gula, kemudian campurkan dengan bahan kering.\n" +
                    "3. Panaskan wajan dan tuang adonan, masak hingga kedua sisi kecoklatan.\n" +
                    "4. Sajikan dengan sirup maple atau topping pilihan."
        ),
        Resep(
            id = 4,
            nama = "Soto Ayam",
            deskripsi = "Soto ayam dengan kuah yang segar dan kaya rempah.",
            bahan = "Daging ayam, serai, daun salam, bawang merah, bawang putih, kunyit, jahe, santan, garam, merica",
            langkah = "1. Rebus ayam hingga matang, kemudian suwir-suwir.\n" +
                    "2. Tumis bumbu seperti bawang merah, bawang putih, kunyit, jahe, serai, dan daun salam.\n" +
                    "3. Masukkan tumisan bumbu ke dalam kuah ayam, tambahkan santan.\n" +
                    "4. Rebus hingga kuah mendidih, tambahkan garam dan merica.\n" +
                    "5. Sajikan dengan nasi putih dan pelengkap seperti telur rebus dan kerupuk."
        ),
        Resep(
            id = 5,
            nama = "Salad Buah",
            deskripsi = "Salad buah segar dengan saus yogurt, cocok untuk camilan sehat.",
            bahan = "Berbagai jenis buah (melon, semangka, anggur, apel, dll.), yogurt, madu",
            langkah = "1. Potong-potong buah sesuai selera.\n" +
                    "2. Campurkan buah dengan yogurt dan madu.\n" +
                    "3. Sajikan segera, atau simpan di kulkas terlebih dahulu."
        )
    )
}