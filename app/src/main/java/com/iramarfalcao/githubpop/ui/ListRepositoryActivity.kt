package com.iramarfalcao.githubpop.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iramarfalcao.githubpop.R
import com.iramarfalcao.githubpop.models.Repository
import com.iramarfalcao.githubpop.ui.adapter.RepositoryAdapter

class ListRepositoryActivity : AppCompatActivity() {

    lateinit var listRepository: RecyclerView
    lateinit var adapter: RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>
    val repositories = ArrayList<Repository>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_repository)

        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )
        repositories.add(
            Repository(
                "Título",
                "Descrição",
                "Avatar",
                "Nome",
                "Username",
                12,
                12
            )
        )

        val layoutManager = LinearLayoutManager(this)
        listRepository = findViewById(R.id.main_recyclerView)
        listRepository.layoutManager = layoutManager

        adapter = RepositoryAdapter(repositories, this)
        listRepository.adapter = adapter

    }
}