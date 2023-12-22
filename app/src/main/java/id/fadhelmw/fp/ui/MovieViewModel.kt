package id.fadhelmw.fp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.fadhelmw.fp.domain.MovieRepository
import kotlinx.coroutines.launch

class MovieViewModel(private val repository: MovieRepository) : ViewModel() {

}
