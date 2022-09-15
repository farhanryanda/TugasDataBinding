package com.farhanryanda.tugasdatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.farhanryanda.tugasdatabinding.data.News

class NewsViewModel : ViewModel() {

    var listNews: MutableLiveData<ArrayList<News>> = MutableLiveData()
    private var newsData = arrayListOf(
        News(
            "Resmi! Marc Marquez Akan Balapan di MotoGP Aragon 2022",
            "2022-09-13",
            "Okdwitya Karina Sari",
            "Jakarta - Juara dunia delapan kali Marc Marquez akhirnya kembali ke lintasan balap. Marquez mengonfirmasi akan turun di MotoGP Aragon 2022, akhir pekan ini.\n" +
                    "Rider Repsol Honda itu sudah absen sejak seri Italia, Mei silam. Marquez menepi sejenak karena harus menjalani operasi untuk menyembuhkan cedera lengan yang sudah lama mengganggunya.\n" +
                    "\n" +
                    "Marquez kemudian bekerja keras melakoni pemulihan sebelum mendapatkan lampu hijau untuk menunggangi motor balap lagi. Pada prosesnya, rider Spanyol berusia 29 tahun itu bisa mengikuti tes MotoGP di Sirkuit Misano dengan lancar di awal pekan ini",
            R.drawable.marc_marquez
        ),
        News(
            "California Laporkan Kematian Pertama Akibat Cacar Monyet di AS - Suara Surabaya",
            "2022-09-14",
            "Dhafintya Noorca",
            "Warga tersebut menderita gangguan sistem kekebalan tubuh (immunocompromised) yang parah dan dirawat di rumah sakit, kata Departemen Kesehatan Masyarakat Los Angeles.",
            R.drawable.monkeypox
        ),
        News(
            "4 Model iPhone Ini Tak Dapat Menampilkan Persentase Baterai di iOS 16 - Tekno Tempo",
            "2022-09-14",
            "Erwin Prima",
            "Apple memperbarui dokumen dukungan untuk mengonfirmasi bahwa persentase baterai tidak ditampilkan di bilah status pada beberapa model iPhone lama.",
            R.drawable.empat_model_iphone
        ),
        News(
            "Armenia-Azerbaijan Kembali Membara! Hampir 100 Tentara Tewas - detikNews",
            "2022-09-14",
            "Rita Uli Hutapea",
            "Perbatasan Armenia dan Azerbaijan kembali membara! Hampir 100 tentara kedua negara tewas pada Selasa (13/9) waktu setempat dalam pertempuran mereka.",
            R.drawable.militer
        ),
        News(
            "ACara Mudah Cek IMEI iPhone dan iPad, Tertera pada Perangkat hingga Cek Online - Tribunnews.com",
            "2022-09-14",
            "Enggar Kusuma Wardani",
            "Berikut cara mudah cek nomor IMEI di iPhone dan iPad. Pengguna iPhone dan iPad dapat menemukan nomor IMEI tertera di SIM Tray hingga dengan cek online",
            R.drawable.cek_imei
        ),
        News(
            "Sebulan Terakhir Ribuan Warga Jawa Barat Terserang DBD, 241 Orang Meninggal - iNews.id",
            "2022-09-14",
            "Agung Bakti Sarasa",
            "DBD mengalami peningkatan, dari pekan kedua Agustus tercatat 24.192 kasus dan September ini menjadi 27.010. Total pasien DBD meninggal 241 orang.",
            R.drawable.dbd
        ),
        News(
            "Harga iPhone 12, iPhone 13, Hingga iPhone 14 Ada di Sini! Cek Harga Resmi dari Apple - Semarangku - Semarang-Ku",
            "2022-09-14",
            "Ahsana Matswaya Nur Azizah",
            "Harga iPhone 12, iPhone 13, dan juga iPhone 14 sudah ada di sini.\\n\\nKamu bisa dapatkan daftar harga iPhone 12, iPhone 13, dan iPhone 14 di da",
            R.drawable.harga_iphone
        ),
        News(
            "Reaksi Keras Lirboyo atas Hinaan Ketum Ganjarist Eko Kuntadhi ke Ning Imaz - detikcom",
            "2022-09-14",
            "Andhika Dwi",
            "Cuitan Eko Kuntadhi menghina Ustazah Imaz Fatimatuz Zahra atau yang akrab disapa Ning Imaz dari Ponpes Liroboyo. Ponpes pun bereaksi atas cuitan tak pantas itu.",
            R.drawable.reaksi_lirboyo
        ),
        News(
            "Rusia Serang Balik Ukraina Habis-habisan usai Dibuat K.O di Kharkiv - CNN Indonesia",
            "2022-09-14",
            "CNN Indonesia",
            "Rusia melancarkan \\\"serangan presisi tinggi\\\" ke sejumlah titik pasukan Ukraina di timur laut negara eks Uni Soviet itu setelah sempat dibuat menyerah.",
            R.drawable.rusia_serang
        ),
        News(
            "Tabel Spesifikasi dan Harga Vivo V25 Pro di Indonesia - Kompas.com - Tekno Kompas.com",
            "2022-09-14",
            "Yudha Pratomo",
            "Vivo V25 Pro membawa sejumlah fitur unggulan, salah satunya Real-Time Extreme Night Vision untuk melihat preview gambar di situasi lowlight.",
            R.drawable.spek
        ),
    )

    fun getNews() {
        listNews.value = newsData
    }
}