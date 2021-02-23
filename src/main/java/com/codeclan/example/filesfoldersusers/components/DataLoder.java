package com.codeclan.example.filesfoldersusers.components;

import com.codeclan.example.filesfoldersusers.models.File;
import com.codeclan.example.filesfoldersusers.models.Folder;
import com.codeclan.example.filesfoldersusers.models.User;
import com.codeclan.example.filesfoldersusers.repositories.FileRepository;
import com.codeclan.example.filesfoldersusers.repositories.FolderRepository;
import com.codeclan.example.filesfoldersusers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoder implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoder() {
    }

    public void run(ApplicationArguments args){

        User jamie = new User("Jamie");
        userRepository.save(jamie);
        User laura = new User("Laura");
        userRepository.save(laura);
        Folder folder1 = new Folder("jamiesStuff", jamie);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("JamiesNotes", jamie);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("LaurasStuff", laura);
        folderRepository.save(folder3);
        File file1 = new File("helloWorld", ".js", 2, folder1);
        fileRepository.save(file1);
        File file2 = new File("notes", ".txt", 2, folder2);
        fileRepository.save(file2);
        File file3 = new File("styleSheet", ".style", 2, folder3);
        fileRepository.save(file3);
        File file4 = new File("index", ".html", 3, folder3);
        fileRepository.save(file4);
        File file5 = new File("Pirates", ".java", 3, folder2);
        fileRepository.save(file5);
        File file6 = new File("helloWorld", ".py", 1, folder3);
        fileRepository.save(file6);

        folder1.addFile(file1);
        folderRepository.save(folder1);
        folder2.addFile(file2);
        folder2.addFile(file5);
        folderRepository.save(folder2);
        folder3.addFile(file3);
        folder3.addFile(file4);
        folder3.addFile(file6);
        folderRepository.save(folder3);

        jamie.addFolder(folder1);
        jamie.addFolder(folder2);
        userRepository.save(jamie);
        laura.addFolder(folder3);
        userRepository.save(laura);









    }
}
