aws ecr get-login-password --region us-west-2 | docker login --username AWS --password-stdin 043439649878.dkr.ecr.us-west-2.amazonaws.com
sudo docker pull 043439649878.dkr.ecr.us-west-2.amazonaws.com/springbootdemo:latest
sudo docker run --name springbootdemo -p 8080:8080 -d 043439649878.dkr.ecr.us-west-2.amazonaws.com/springbootdemo:latest