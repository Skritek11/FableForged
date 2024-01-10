execute as @e[tag=cid] at @s anchored eyes rotated ~ 0 positioned ^ ^-0.5 ^-0.5 run function fableforged:cid/teleport/teleportcutslash
execute as @e[tag=teleporttarget] at @s run particle dust 0 0 0 1 ~ ~1 ~ 0.5 0.5 0.5 0 20 force
execute as @e[tag=teleporttarget] at @s run particle dust 0.878 0.133 0.443 1 ~ ~1 ~ 0.5 0.5 0.5 0 30 force
execute as @e[tag=teleporttarget] at @s run power grant @e[tag=teleporttarget] fableforged:cid/damage
execute as @e[tag=cid] at @s run playsound entity.player.attack.crit master @a ~ ~ ~ 1 1
execute as @e[tag=cid] at @s run playsound entity.player.attack.sweep master @a ~ ~ ~ 1 1
execute as @e[tag=cid] at @s run playsound entity.generic.explode master @a ~ ~ ~ 1 2
schedule function fableforged:cid/teleport/teleportend 5t