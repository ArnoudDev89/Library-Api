package io.github.arnouddev89.Library_Api.repository;

import io.github.arnouddev89.Library_Api.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {
}