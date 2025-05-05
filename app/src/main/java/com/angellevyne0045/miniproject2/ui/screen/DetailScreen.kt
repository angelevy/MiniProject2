package com.angellevyne0045.miniproject2.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.angellevyne0045.miniproject2.R
import com.angellevyne0045.miniproject2.ui.theme.MIniProject2Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen() {
    var nama by remember { mutableStateOf("") }
    var deskripsi by remember { mutableStateOf("") }
    var bahan by remember { mutableStateOf("") }
    var langkah by remember { mutableStateOf("") }

    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(R.string.tambah_resep))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        },
    ) { padding ->
        FormResep(
            nama = nama,
            onNamaChange = { nama = it },
            deskripsi = deskripsi,
            onDeskripsiChange = { deskripsi = it },
            bahan = bahan,
            onBahanChange = { bahan = it },
            langkah = langkah,
            onLangkahChange = { langkah = it },
            modifier = Modifier.padding(padding)
        )
    }
}

@Composable
fun FormResep(
    nama: String, onNamaChange: (String) -> Unit,
    deskripsi: String, onDeskripsiChange: (String) -> Unit,
    bahan: String, onBahanChange: (String) -> Unit,
    langkah: String, onLangkahChange: (String) -> Unit,
    modifier: Modifier
) {
    Column (
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        OutlinedTextField(
            value = nama,
            onValueChange = {onNamaChange(it) },
            label = { Text(text = stringResource(R.string.nama)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = deskripsi,
            onValueChange = {onDeskripsiChange(it) },
            label = { Text(text = stringResource(R.string.deskripsi)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = bahan,
            onValueChange = {onBahanChange(it) },
            label = { Text(text = stringResource(R.string.bahan)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = langkah,
            onValueChange = {onLangkahChange(it) },
            label = { Text(text = stringResource(R.string.langkah)) },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Sentences,
            ),
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DetailScreenPreview() {
    MIniProject2Theme {
        DetailScreen()
    }
}