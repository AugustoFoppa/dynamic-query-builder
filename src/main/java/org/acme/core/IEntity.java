package org.acme.core;

import java.sql.Timestamp;

public interface IEntity<ID> {

    ID getId();
    void setId(ID id);

    Timestamp getVersion();
    void setVersion(Timestamp version);

}
