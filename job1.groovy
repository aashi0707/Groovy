job("a1){
     description("my first description 1")
    
     scm{
        gtihub ('vimallinux13/devopsal1, 'master')
        }

     triggers{
             scm("* * * * *")
             }

     steps{
          shell('sudo docker run -itd --name myweb1 p 8085:80 -v /web:/usr/local/apache2/htdocs httpd')
          }
}
