package utilities
 
import javaposse.jobdsl.dsl.DslFactory
 
class GithubPipeline {
 
    String name
    String description
    String displayName
    String branchesName
    String urlRepo
    String credentialsId
 
 
    void build(DslFactory dslFactory) {
        def job = dslFactory.pipelineJob(name) {
            description(description)
            displayName(displayName)
            definition {
                cpsScm {
                    scm {
                        git {
                            branches(main)
                            remote {
                                url(urlRepo)
                                credentials(credentialsId)
                            }
                        }
                        scriptPath('Jenkinsfile')
                        lightweight(true)
                    }
                }
            }
            parameters {
                choiceParam ('Environment', ['staging', 'production', 'staging-without-cache'], 'Please choice env to build')
            }
            triggers {
                github.Push()
            }
        }
    }
}
