// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobTemplatesResponseBody</p>
 */
public class ListJobTemplatesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Templates")
    private Templates templates;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public Templates getTemplates() {
        return this.templates;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Templates templates; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobTemplatesResponseBody build() {
            return new ListJobTemplatesResponseBody(this);
        } 

    } 

    public static class JobTemplates extends TeaModel {
        @NameInMap("ArrayRequest")
        private String arrayRequest;

        @NameInMap("ClockTime")
        private String clockTime;

        @NameInMap("CommandLine")
        private String commandLine;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Id")
        private String id;

        @NameInMap("InputFileUrl")
        private String inputFileUrl;

        @NameInMap("Mem")
        private String mem;

        @NameInMap("Name")
        private String name;

        @NameInMap("Node")
        private Integer node;

        @NameInMap("PackagePath")
        private String packagePath;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("ReRunable")
        private Boolean reRunable;

        @NameInMap("RunasUser")
        private String runasUser;

        @NameInMap("StderrRedirectPath")
        private String stderrRedirectPath;

        @NameInMap("StdoutRedirectPath")
        private String stdoutRedirectPath;

        @NameInMap("Task")
        private Integer task;

        @NameInMap("Thread")
        private Integer thread;

        @NameInMap("UnzipCmd")
        private String unzipCmd;

        @NameInMap("Variables")
        private String variables;

        @NameInMap("WithUnzipCmd")
        private Boolean withUnzipCmd;

        private JobTemplates(Builder builder) {
            this.arrayRequest = builder.arrayRequest;
            this.clockTime = builder.clockTime;
            this.commandLine = builder.commandLine;
            this.gpu = builder.gpu;
            this.id = builder.id;
            this.inputFileUrl = builder.inputFileUrl;
            this.mem = builder.mem;
            this.name = builder.name;
            this.node = builder.node;
            this.packagePath = builder.packagePath;
            this.priority = builder.priority;
            this.queue = builder.queue;
            this.reRunable = builder.reRunable;
            this.runasUser = builder.runasUser;
            this.stderrRedirectPath = builder.stderrRedirectPath;
            this.stdoutRedirectPath = builder.stdoutRedirectPath;
            this.task = builder.task;
            this.thread = builder.thread;
            this.unzipCmd = builder.unzipCmd;
            this.variables = builder.variables;
            this.withUnzipCmd = builder.withUnzipCmd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobTemplates create() {
            return builder().build();
        }

        /**
         * @return arrayRequest
         */
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        /**
         * @return clockTime
         */
        public String getClockTime() {
            return this.clockTime;
        }

        /**
         * @return commandLine
         */
        public String getCommandLine() {
            return this.commandLine;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inputFileUrl
         */
        public String getInputFileUrl() {
            return this.inputFileUrl;
        }

        /**
         * @return mem
         */
        public String getMem() {
            return this.mem;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return node
         */
        public Integer getNode() {
            return this.node;
        }

        /**
         * @return packagePath
         */
        public String getPackagePath() {
            return this.packagePath;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return reRunable
         */
        public Boolean getReRunable() {
            return this.reRunable;
        }

        /**
         * @return runasUser
         */
        public String getRunasUser() {
            return this.runasUser;
        }

        /**
         * @return stderrRedirectPath
         */
        public String getStderrRedirectPath() {
            return this.stderrRedirectPath;
        }

        /**
         * @return stdoutRedirectPath
         */
        public String getStdoutRedirectPath() {
            return this.stdoutRedirectPath;
        }

        /**
         * @return task
         */
        public Integer getTask() {
            return this.task;
        }

        /**
         * @return thread
         */
        public Integer getThread() {
            return this.thread;
        }

        /**
         * @return unzipCmd
         */
        public String getUnzipCmd() {
            return this.unzipCmd;
        }

        /**
         * @return variables
         */
        public String getVariables() {
            return this.variables;
        }

        /**
         * @return withUnzipCmd
         */
        public Boolean getWithUnzipCmd() {
            return this.withUnzipCmd;
        }

        public static final class Builder {
            private String arrayRequest; 
            private String clockTime; 
            private String commandLine; 
            private Integer gpu; 
            private String id; 
            private String inputFileUrl; 
            private String mem; 
            private String name; 
            private Integer node; 
            private String packagePath; 
            private Integer priority; 
            private String queue; 
            private Boolean reRunable; 
            private String runasUser; 
            private String stderrRedirectPath; 
            private String stdoutRedirectPath; 
            private Integer task; 
            private Integer thread; 
            private String unzipCmd; 
            private String variables; 
            private Boolean withUnzipCmd; 

            /**
             * ArrayRequest.
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * ClockTime.
             */
            public Builder clockTime(String clockTime) {
                this.clockTime = clockTime;
                return this;
            }

            /**
             * CommandLine.
             */
            public Builder commandLine(String commandLine) {
                this.commandLine = commandLine;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InputFileUrl.
             */
            public Builder inputFileUrl(String inputFileUrl) {
                this.inputFileUrl = inputFileUrl;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Node.
             */
            public Builder node(Integer node) {
                this.node = node;
                return this;
            }

            /**
             * PackagePath.
             */
            public Builder packagePath(String packagePath) {
                this.packagePath = packagePath;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * ReRunable.
             */
            public Builder reRunable(Boolean reRunable) {
                this.reRunable = reRunable;
                return this;
            }

            /**
             * RunasUser.
             */
            public Builder runasUser(String runasUser) {
                this.runasUser = runasUser;
                return this;
            }

            /**
             * StderrRedirectPath.
             */
            public Builder stderrRedirectPath(String stderrRedirectPath) {
                this.stderrRedirectPath = stderrRedirectPath;
                return this;
            }

            /**
             * StdoutRedirectPath.
             */
            public Builder stdoutRedirectPath(String stdoutRedirectPath) {
                this.stdoutRedirectPath = stdoutRedirectPath;
                return this;
            }

            /**
             * Task.
             */
            public Builder task(Integer task) {
                this.task = task;
                return this;
            }

            /**
             * Thread.
             */
            public Builder thread(Integer thread) {
                this.thread = thread;
                return this;
            }

            /**
             * UnzipCmd.
             */
            public Builder unzipCmd(String unzipCmd) {
                this.unzipCmd = unzipCmd;
                return this;
            }

            /**
             * Variables.
             */
            public Builder variables(String variables) {
                this.variables = variables;
                return this;
            }

            /**
             * WithUnzipCmd.
             */
            public Builder withUnzipCmd(Boolean withUnzipCmd) {
                this.withUnzipCmd = withUnzipCmd;
                return this;
            }

            public JobTemplates build() {
                return new JobTemplates(this);
            } 

        } 

    }
    public static class Templates extends TeaModel {
        @NameInMap("JobTemplates")
        private java.util.List < JobTemplates> jobTemplates;

        private Templates(Builder builder) {
            this.jobTemplates = builder.jobTemplates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return jobTemplates
         */
        public java.util.List < JobTemplates> getJobTemplates() {
            return this.jobTemplates;
        }

        public static final class Builder {
            private java.util.List < JobTemplates> jobTemplates; 

            /**
             * JobTemplates.
             */
            public Builder jobTemplates(java.util.List < JobTemplates> jobTemplates) {
                this.jobTemplates = jobTemplates;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
