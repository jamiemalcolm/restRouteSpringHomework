package com.codeclan.example.filesfoldersusers.repositories;

import com.codeclan.example.filesfoldersusers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
