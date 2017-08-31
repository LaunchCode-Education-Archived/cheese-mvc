package org.launchcode.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by LaunchCode
 */

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int uid;

    public int getUid() {
        return this.uid;
    }

}
