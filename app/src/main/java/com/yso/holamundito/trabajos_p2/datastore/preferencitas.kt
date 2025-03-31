package com.yso.holamundito.trabajos_p2.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

class Preferencitas(private val context: Context) {
    companion object { // para que sea singleton el acceso al archivo
        val Context.dataStore: DataStore<Preferences>
                by preferencesDataStore("settings")

        /* llaves
            settings.txt
        */

        val AGE = intPreferencesKey("edad")
        val NAME = stringPreferencesKey("nombre")
        val SIGNUP = booleanPreferencesKey("registrado")
    }

    // Flow: parte de las corrutinas para transmitir(recibir) el flujo de datos tipo Int
    val age: Flow<Int> = context.dataStore.data.map { preferences ->
        // No type safety
        preferences[AGE] ?: 0
    }

    suspend fun getAge(): Int {
        val pref = context.dataStore.data.first()
        return pref[AGE] ?: 0
    }

    //
    suspend fun savePersonData(personName: String, personAge: Int) {
        context.dataStore.edit { settings ->
            settings[AGE] = personAge
            settings[NAME] = personName
        }
    }

    // Flujo de datos tipo String
    val name: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[NAME] ?: ""
    }

    suspend fun getName(): String {
        val pref = context.dataStore.data.first()
        return pref[NAME] ?: ""
    }

    // Flujo de datos tipo Booleano
    val signup: Flow<Boolean> = context.dataStore.data.map { preferences ->
        preferences[SIGNUP] == true
    }

    suspend fun getSignup(): Boolean {
        val pref = context.dataStore.data.first()
        return pref[SIGNUP] == true
    }

    suspend fun clearSession() {
        context.dataStore.edit { preferences ->
            preferences.remove(AGE)
            preferences.remove(NAME)
        }
    }

}