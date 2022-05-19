//def gv
pipeline {
    agent any
    parameters{
        //yyyy-MM-dd HH:mm:ss	2012-01-31 23:59:59
        string(name: 'START_DATETIME', defaultValue: '', description: 'epoch start date time')
        string(name: 'END_DATETIME', defaultValue: '', description: 'epoch end time')
        choice(name: 'CLUSTER', choices: ['qe','prod'], description: 'deploy cluster details, it will be deployed in tlb-repair ns')
        
    }
    environment { 
        // K8s credentials
       // KUBECONFIG = credentials('my-kubeconfig')
        // cluster details
        //NAMESPACE = ''
        //CLUSTER = ''
        //COMMIT_SET= ''
        //IMAGE_BRANCH_VALUE = ''
        //IMAGE_TAG_VALUE=''
        //DOCKER_IMAGE=''
        //API_JFROG =''
        //TAGS_REQUEST_URL=''
        //TAG_CHK =''
        //VALUES_FILE=''


    }

    stages {
        stage("init"){
            steps{
                script{
                    echo "start of pipeline 2"
                   // gv= load "src/validate.groovy"
                }
            }
        }
        stage('Validate') {
            steps {
                script{
                    // validate parameters are correct
                    // image is available in jfrog
                    echo "start of validaton stage"
                    //gv.validateTime()
                }
                
            }
        }
        stage('Deploy') {
            steps {
                // deploy image and create pods
                // once deployment is complete, update publisher-sts with
                //kubectl set env -n tlb-qe-repair statefulset.apps akka-publisher-sts APP_CONFIG="-Dkafka.topic-name=tlb-repair 
                //-Dkafka.producer-parallelism=10 -Dhdfs-rawlogs.filesystem=hftp://pds-hadoop-nn.us-east4.qe.gcp.conviva.com:50070 
                //-Dkafka.bootstrap-servers=kafka-kafka-0.kafka-kafka-brokers.tlb-kafka.svc:9094 
                //-Dhdfs-rawlogs.dir-path=/user/hadoop/data/rawlogs/ -Dhdfs-rawlogs.file-path.start-interval=1641864625 -
                //Dhdfs-rawlogs.file-path.end-interval=1641866425";

                //Increase replica to 1
                //kubectl scale --replicas=1 -n tlb-qe-repair statefulset.apps akka-publisher-sts

                
                echo 'Deploying tlb-repair in environment'
            }
        }
        stage('Monitor') {
            steps {
                // check the logs of running jobs for each minute and see the logs of last minute is processed
                // once all processing is done, update the status as successfull 
                echo 'Monitoring the job....'

            }
        }
    }
}
