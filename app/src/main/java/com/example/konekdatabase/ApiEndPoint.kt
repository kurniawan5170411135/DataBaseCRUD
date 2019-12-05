package com.example.konekdatabase

class ApiEndPoint {

    companion object {
        private val SERVER = "http://192.168.43.238/mahasiswa/"
        val CREATE      = SERVER + "create.php"
        val READ        = SERVER + "read.php"
        val UPDATE      = SERVER + "update.php"
        val DELETE      = SERVER + "delete.php"
    }
}