package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.CabecalhoOrdemCompra;

public interface CabecalhoOrdemCompraRepository extends JpaRepository
<CabecalhoOrdemCompra, String> {	
}
