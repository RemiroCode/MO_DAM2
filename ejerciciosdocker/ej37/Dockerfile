FROM ubuntu:22.04
RUN apt update && apt install -y apache2 
COPY public_html/ /var/www/html/
CMD ["apache2ctl", "-D", "FOREGROUND"]
