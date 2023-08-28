// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceDeployResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceDeployResponseBody</p>
 */
public class GetDataSourceDeployResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetDataSourceDeployResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceDeployResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDataSourceDeployResponseBody build() {
            return new GetDataSourceDeployResponseBody(this);
        } 

    } 

    public static class Hdfs extends TeaModel {
        @NameInMap("path")
        private String path;

        private Hdfs(Builder builder) {
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hdfs create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String path; 

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Hdfs build() {
                return new Hdfs(this);
            } 

        } 

    }
    public static class Odps extends TeaModel {
        @NameInMap("partitions")
        private java.util.Map < String, String > partitions;

        private Odps(Builder builder) {
            this.partitions = builder.partitions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Odps create() {
            return builder().build();
        }

        /**
         * @return partitions
         */
        public java.util.Map < String, String > getPartitions() {
            return this.partitions;
        }

        public static final class Builder {
            private java.util.Map < String, String > partitions; 

            /**
             * partitions.
             */
            public Builder partitions(java.util.Map < String, String > partitions) {
                this.partitions = partitions;
                return this;
            }

            public Odps build() {
                return new Odps(this);
            } 

        } 

    }
    public static class Oss extends TeaModel {
        @NameInMap("path")
        private String path;

        private Oss(Builder builder) {
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String path; 

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
    public static class Saro extends TeaModel {
        @NameInMap("path")
        private String path;

        @NameInMap("version")
        private String version;

        private Saro(Builder builder) {
            this.path = builder.path;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Saro create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String path; 
            private String version; 

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Saro build() {
                return new Saro(this);
            } 

        } 

    }
    public static class Extend extends TeaModel {
        @NameInMap("hdfs")
        private Hdfs hdfs;

        @NameInMap("odps")
        private Odps odps;

        @NameInMap("oss")
        private Oss oss;

        @NameInMap("saro")
        private Saro saro;

        private Extend(Builder builder) {
            this.hdfs = builder.hdfs;
            this.odps = builder.odps;
            this.oss = builder.oss;
            this.saro = builder.saro;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extend create() {
            return builder().build();
        }

        /**
         * @return hdfs
         */
        public Hdfs getHdfs() {
            return this.hdfs;
        }

        /**
         * @return odps
         */
        public Odps getOdps() {
            return this.odps;
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        /**
         * @return saro
         */
        public Saro getSaro() {
            return this.saro;
        }

        public static final class Builder {
            private Hdfs hdfs; 
            private Odps odps; 
            private Oss oss; 
            private Saro saro; 

            /**
             * hdfs.
             */
            public Builder hdfs(Hdfs hdfs) {
                this.hdfs = hdfs;
                return this;
            }

            /**
             * odps.
             */
            public Builder odps(Odps odps) {
                this.odps = odps;
                return this;
            }

            /**
             * oss.
             */
            public Builder oss(Oss oss) {
                this.oss = oss;
                return this;
            }

            /**
             * saro.
             */
            public Builder saro(Saro saro) {
                this.saro = saro;
                return this;
            }

            public Extend build() {
                return new Extend(this);
            } 

        } 

    }
    public static class Processor extends TeaModel {
        @NameInMap("args")
        private String args;

        @NameInMap("resource")
        private String resource;

        private Processor(Builder builder) {
            this.args = builder.args;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processor create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String args; 
            private String resource; 

            /**
             * args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public Processor build() {
                return new Processor(this);
            } 

        } 

    }
    public static class Storage extends TeaModel {
        @NameInMap("accessKey")
        private String accessKey;

        @NameInMap("accessSecret")
        private String accessSecret;

        @NameInMap("bucket")
        private String bucket;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("ossPath")
        private String ossPath;

        @NameInMap("partition")
        private String partition;

        @NameInMap("path")
        private String path;

        @NameInMap("project")
        private String project;

        @NameInMap("table")
        private String table;

        private Storage(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.namespace = builder.namespace;
            this.ossPath = builder.ossPath;
            this.partition = builder.partition;
            this.path = builder.path;
            this.project = builder.project;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessSecret
         */
        public String getAccessSecret() {
            return this.accessSecret;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String bucket; 
            private String endpoint; 
            private String namespace; 
            private String ossPath; 
            private String partition; 
            private String path; 
            private String project; 
            private String table; 

            /**
             * accessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * accessSecret.
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ossPath.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * partition.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    public static class Swift extends TeaModel {
        @NameInMap("topic")
        private String topic;

        @NameInMap("zk")
        private String zk;

        private Swift(Builder builder) {
            this.topic = builder.topic;
            this.zk = builder.zk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Swift create() {
            return builder().build();
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return zk
         */
        public String getZk() {
            return this.zk;
        }

        public static final class Builder {
            private String topic; 
            private String zk; 

            /**
             * topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * zk.
             */
            public Builder zk(String zk) {
                this.zk = zk;
                return this;
            }

            public Swift build() {
                return new Swift(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @NameInMap("extend")
        private Extend extend;

        @NameInMap("processor")
        private Processor processor;

        @NameInMap("storage")
        private Storage storage;

        @NameInMap("swift")
        private Swift swift;

        private Result(Builder builder) {
            this.autoBuildIndex = builder.autoBuildIndex;
            this.extend = builder.extend;
            this.processor = builder.processor;
            this.storage = builder.storage;
            this.swift = builder.swift;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return autoBuildIndex
         */
        public Boolean getAutoBuildIndex() {
            return this.autoBuildIndex;
        }

        /**
         * @return extend
         */
        public Extend getExtend() {
            return this.extend;
        }

        /**
         * @return processor
         */
        public Processor getProcessor() {
            return this.processor;
        }

        /**
         * @return storage
         */
        public Storage getStorage() {
            return this.storage;
        }

        /**
         * @return swift
         */
        public Swift getSwift() {
            return this.swift;
        }

        public static final class Builder {
            private Boolean autoBuildIndex; 
            private Extend extend; 
            private Processor processor; 
            private Storage storage; 
            private Swift swift; 

            /**
             * autoBuildIndex.
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * extend.
             */
            public Builder extend(Extend extend) {
                this.extend = extend;
                return this;
            }

            /**
             * processor.
             */
            public Builder processor(Processor processor) {
                this.processor = processor;
                return this;
            }

            /**
             * storage.
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * swift.
             */
            public Builder swift(Swift swift) {
                this.swift = swift;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
