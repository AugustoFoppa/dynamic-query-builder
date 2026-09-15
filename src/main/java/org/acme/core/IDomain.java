package org.acme.core;

import java.sql.Timestamp;

public interface IDomain {

    Long getId();
    void setId(Long id);

    Timestamp getVersion();
    void setVersion(Timestamp version);
}
