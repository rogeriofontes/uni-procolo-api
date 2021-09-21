package br.com.unipac.uniprocoloapi.model.service.impl;

import br.com.unipac.uniprocoloapi.model.domain.Aluno;
import br.com.unipac.uniprocoloapi.model.repository.AlunoRepositorio;
import br.com.unipac.uniprocoloapi.model.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @Override
    public Aluno salvar(Aluno aluno) {
        return alunoRepositorio.save(aluno);
    }

    @Override
    public Aluno editar(Long id, Aluno aluno) {
        aluno.setId(id);
        return alunoRepositorio.save(aluno);
    }

    @Override
    public List<Aluno> listaTodos() {
        return alunoRepositorio.findAll();
    }

    @Override
    public Aluno buscarPorId(Long id) {
        return alunoRepositorio.getById(id);
    }

    @Override
    public void deletarPorId(Long id) {
        alunoRepositorio.deleteById(id);
    }
}
