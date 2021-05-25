drop database if exists anime_db;
create database anime_db;
use anime_db;

create table anime(
	anime_id INT primary key auto_increment,
	name VARCHAR(100) not null,
	genre VARCHAR(25) not null,
	episode_count INT not null,
	studio VARCHAR(30) not null,
	review VARCHAR(100)
	
);


insert into anime(name,genre, episode_count,studio)
values
('Dragon Ball Z', 'Action', 291, 'Toei Animation'),
('Attack on Titan','Action',25,'Wit Studio'),
('CowBoy Bebop','Sci-Fi',26,'Sunrise Studio'),
('The Promise Neverland','Sci-Fi',12,'Cloverworks'),
('Bleach','Action',366,'Studio pierrot'),
('Hunter X Hunter','Action',148, 'Madhouse'),
('One Punch Man','Action',24,'MadHouse'),
('Mob Psycho 100','Supernatural',12,'Bones'),
('Full Metal Alchemist / Brotherhood','Military',64,'Bones'),
('Sword Art online','Action',25,'A-1 Pictures'),
('Demon Slayer','Supernatural',26,'ufotable'),
('Fate Stay Night Fate ZERO','Fantasy',13,'ufotable'),
('Re-Zero', 'Action', 25 , 'White Fox'),
('Mobile Suit Gundam Wing','Sci-Fi',49,'Sunrise Studios'),
('Helsing','Horror', 13, 'Gonzo'),
('Fairy Tale','Fantisy',175,'A-1 Pictures')
;

commit;