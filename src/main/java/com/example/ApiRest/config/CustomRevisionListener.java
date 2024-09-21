package com.example.ApiRest.config;

import com.example.ApiRest.Audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) {

        final Revision revision = (Revision) revisionEntity;
    }

}
