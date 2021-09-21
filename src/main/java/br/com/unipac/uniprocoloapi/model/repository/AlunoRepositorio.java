package br.com.unipac.uniprocoloapi.model.repository;

import br.com.unipac.uniprocoloapi.model.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
}
