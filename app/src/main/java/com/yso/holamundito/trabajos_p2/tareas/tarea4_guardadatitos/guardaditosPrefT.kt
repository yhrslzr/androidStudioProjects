package com.yso.holamundito.trabajos_p2.tareas.tarea4_guardadatitos

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

class guardaditosPreferencitas(private val context: Context) {
    companion object { // para que sea singleton el acceso al archivo
        val Context.dataStore: DataStore<Preferences>
                by preferencesDataStore("settings")

        /* llaves
            settings.txt
        */

        val NAME = stringPreferencesKey("nombre")
        val AGE = intPreferencesKey("edad")
        val HEIGHT = floatPreferencesKey("altura")
        val MONEY = floatPreferencesKey("dinero")
    }

    // Flujo de datos tipo String
    val name: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[NAME] ?: ""
    }

    suspend fun getName(): String {
        val pref = context.dataStore.data.first()
        return pref[NAME] ?: ""
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

    val height: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[HEIGHT] ?: 0f
    }

    suspend fun getHeight(): Float {
        val pref = context.dataStore.data.first()
        return pref[HEIGHT] ?: 0f
    }

    val money: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[MONEY] ?: 0f
    }

    suspend fun getMoney(): Float {
        val pref = context.dataStore.data.first()
        return pref[MONEY] ?: 0f
    }

    //
    suspend fun savePersonData(
        personName: String,
        personAge: Int,
        personHeight: Float,
        personMoney: Float
    ) {
        context.dataStore.edit { settings ->
            settings[NAME] = personName
            settings[AGE] = personAge
            settings[HEIGHT] = personHeight
            settings[MONEY] = personMoney
        }
    }

    suspend fun clearSession() {
        context.dataStore.edit { preferences ->
            preferences.remove(NAME)
            preferences.remove(AGE)
            preferences.remove(HEIGHT)
            preferences.remove(MONEY)
        }
    }

}