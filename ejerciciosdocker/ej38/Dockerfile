FROM debian
RUN apt update && apt install -y apache2 libapache2-mod-php php 
COPY app/ /var/www/html/
CMD ["apache2ctl", "-D", "FOREGROUND"]
