// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPackageResponseBody} extends {@link TeaModel}
 *
 * <p>GetPackageResponseBody</p>
 */
public class GetPackageResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetPackageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPackageResponseBody build() {
            return new GetPackageResponseBody(this);
        } 

    } 

    public static class AllowedProjectList extends TeaModel {
        @NameInMap("label")
        private String label;

        @NameInMap("project")
        private String project;

        private AllowedProjectList(Builder builder) {
            this.label = builder.label;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowedProjectList create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String label; 
            private String project; 

            /**
             * The security level for sensitive data.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The name of the MaxCompute project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public AllowedProjectList build() {
                return new AllowedProjectList(this);
            } 

        } 

    }
    public static class Function extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        private Function(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

            /**
             * The operations that were performed on the function.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the function.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        private Resource(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

            /**
             * The operations that were performed on the resource.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Table extends TeaModel {
        @NameInMap("actions")
        private java.util.List < String > actions;

        @NameInMap("name")
        private String name;

        private Table(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private String name; 

            /**
             * The operations that were performed on the table.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    public static class ResourceList extends TeaModel {
        @NameInMap("function")
        private java.util.List < Function> function;

        @NameInMap("resource")
        private java.util.List < Resource> resource;

        @NameInMap("table")
        private java.util.List < Table> table;

        private ResourceList(Builder builder) {
            this.function = builder.function;
            this.resource = builder.resource;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public java.util.List < Function> getFunction() {
            return this.function;
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        /**
         * @return table
         */
        public java.util.List < Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < Function> function; 
            private java.util.List < Resource> resource; 
            private java.util.List < Table> table; 

            /**
             * The functions.
             */
            public Builder function(java.util.List < Function> function) {
                this.function = function;
                return this;
            }

            /**
             * The resources.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The tables.
             */
            public Builder table(java.util.List < Table> table) {
                this.table = table;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("allowedProjectList")
        private java.util.List < AllowedProjectList> allowedProjectList;

        @NameInMap("resourceList")
        private ResourceList resourceList;

        private Data(Builder builder) {
            this.allowedProjectList = builder.allowedProjectList;
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowedProjectList
         */
        public java.util.List < AllowedProjectList> getAllowedProjectList() {
            return this.allowedProjectList;
        }

        /**
         * @return resourceList
         */
        public ResourceList getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private java.util.List < AllowedProjectList> allowedProjectList; 
            private ResourceList resourceList; 

            /**
             * The projects in which the package is installed.
             */
            public Builder allowedProjectList(java.util.List < AllowedProjectList> allowedProjectList) {
                this.allowedProjectList = allowedProjectList;
                return this;
            }

            /**
             * The details of the resources that are included in the package.
             */
            public Builder resourceList(ResourceList resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
