package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Yingnan";
        } else if (query.contains("age")){ // TODO extend the programm here
            return "22";
        } else if (query.contains("Tobias Lasser")) {
            return "Computational Imaging\n" +
                    "Inverse Problems in Tomographic Reconstruction\n" +
                    "X-ray Phase-Contrast and Dark-field Imaging\n" +
                    "Light Field Microscopy\n" +
                    "Clinical Decision Support in Radiology and Dermatology\n";
        } else if (query.contains("Christian Karpfinger")) {
            return "Nach dem Abitur 1992 studierte Karpfinger von 1992 bis 1998 an der Technischen Universität München Mathematik und Physik. Von 1999 bis 2002 war er wissenschaftlicher Mitarbeiter bei Heinz Wähling an der Technischen Universität München, wo er 2002 mit der Dissertation Über bewertete Dicksonsche Fastkörper promoviert wurde.";
        }
        return "";


    }
}
