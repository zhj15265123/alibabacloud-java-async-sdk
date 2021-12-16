// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>DeleteSavedSearchRequest</p>
 */
public class DeleteSavedSearchRequest extends Request {
    @Path
    @NameInMap("savedsearchName")
    private String savedsearchName;

    @Host
    @NameInMap("project")
    private String project;


    private DeleteSavedSearchRequest(Builder builder) {
        super(builder);
        this.savedsearchName = builder.savedsearchName;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSavedSearchRequest create() {
        return builder().build();
    }

    /**
     * @return savedsearchName
     */
    public String getSavedsearchName() {
        return this.savedsearchName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String savedsearchName; 
        private String project; 

        /**
         * <p>savedsearchName.</p>
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putPathParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * <p>A short description of struct</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        public DeleteSavedSearchRequest build() {
            return new DeleteSavedSearchRequest(this);
        } 

    } 

}
