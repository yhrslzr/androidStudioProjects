package com.yso.holamundito.trabajos_p2.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

class Preferencitas(private val context: Context) {
    companion object { // para que sea singleton el acceso al archivo
        val Context.dataStore: DataStore<Preferences>
                by preferencesDataStore("settings")
    }
}