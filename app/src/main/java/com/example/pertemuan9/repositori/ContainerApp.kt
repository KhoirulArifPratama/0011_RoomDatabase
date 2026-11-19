package com.example.pertemuan9.repositori

import android.content.Context
import com.example.pertemuan9.room.DatabaseSiswa

/**
 * Container dependensi injeksi aplikasi
 */
interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}

/**
 * Implementasi ContainerApp yang menyediakan dependensi repositori data siswa
 */
class ContainerDataApp(private val context: Context) : ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}
