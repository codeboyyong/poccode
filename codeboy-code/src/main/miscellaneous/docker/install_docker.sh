#1 install
curl -s https://get.docker.io/ubuntu/ | sudo sh

#The script will do couple of things and finally you will see the following out which means installation is fnished :
#2 start
sudo docker run -i -t ubuntu /bin/bash

#This will start the sell as root in interactive mode.SInce it is first time it will pull the original docker image from the web

#3 configuration

run this line of script inside the docker shell and change the password of root

sudo apt-get update ; sudo apt-get install openssh-server bridge-utils ; passwd


4 sudo docker commit [$ID]  codeboyyong/myfirstdockerimage  ; sudo docker kill $ID
Please run "docker ps " in another terminal windown first to  get the container id.

Note exit the bash , "codeboyyong/myfirstdockerimage" is my image name

5 sudo docker run -d -p 2222:22 codeboyyong/myfirstdockerimage /usr/sbin/sshd -D

Now you can ssh it and do whatever you want .
ssh root@127.0.0.1 -p 2222


Show images
sudo docker images -q
Show Process
sudo docker ps
Removed all iamges
sudo docker images -q| xargs sudo docker rmi
Remove all old containers
sudo docker ps -a | grep 'weeks ago' | awk '{print $1}' | sudo xargs docker rm


$ sudo docker commit 4a5715a915e5 shekhargulati/node_image_007
$ sudo docker push shekhargulati/node_image_007
用你自己的用户名和镜像名。
就这样，我的第一个镜像完成，上传到Docker registry https://index.docker.io/u/shekhargulati/node_image_007/.
可以用pull命令从registry获取镜像。
$ docker pull shekhargulati/node_image_007